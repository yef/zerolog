package com.obsidiandynamics.zerolog;

public final class Slf4jBinding implements LogServiceBinding {
  @Override
  public byte getPriority() {
    return Byte.MAX_VALUE;
  }
  
  @Override
  public LogService getLogService() {
    return new Slf4jLogService();
  }
}
