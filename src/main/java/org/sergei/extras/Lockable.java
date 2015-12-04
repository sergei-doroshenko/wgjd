package org.sergei.extras;

import java.util.concurrent.locks.ReentrantLock;

interface Lockable {
  public ReentrantLock getLock();
}
