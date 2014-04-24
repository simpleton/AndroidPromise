package org.sim.promise;

/**
 * Created by simsun on 2014/4/23.
 */
public interface ProgressCallback<Prog> {
    public void onProgress(final Prog progress);
}
