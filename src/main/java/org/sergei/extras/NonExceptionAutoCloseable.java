package org.sergei.extras;

public interface NonExceptionAutoCloseable extends AutoCloseable {
  void close();
}
