package org.sim.promise;

import java.lang.InterruptedException; /**
 * Created by simsun on 2014/4/23.
 */
public interface Promise<Done, Fail, Prog> {
    public enum State {
        PENDING,
        REJECTED,
        RESOLVED
    }

    public State state();

    public Promise<Done, Fail, Prog> then(DoneCallback<Done> doneCallback);

    public Promise<Done, Fail, Prog> then(
            DoneCallback<Done> doneCallback, FailCallback<Fail> failCallback);

    public Promise<Done, Fail, Prog> then(
            DoneCallback<Done> doneCallback,
            FailCallback<Fail> failCallback,
            ProgressCallback<Prog> progressCallback
    );

    public Promise<Done, Fail, Prog> done(DoneCallback<Done> callback);
    public Promise<Done, Fail, Prog> fail(FailCallback<Fail> callback);
    public Promise<Done, Fail, Prog> progress(ProgressCallback<Prog> callback);
    public void waitSafely() throws InterruptedException;

    public void waitSafely(long timeout) throws InterruptedException;
}
