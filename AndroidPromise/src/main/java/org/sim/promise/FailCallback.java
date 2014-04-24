package org.sim.promise;

/**
 * Created by simsun on 2014/4/23.
 */
public interface FailCallback<Fail> {
    public void onFail(final Fail failInfo);
}
