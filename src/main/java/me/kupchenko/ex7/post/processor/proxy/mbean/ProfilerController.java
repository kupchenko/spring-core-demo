package me.kupchenko.ex7.post.processor.proxy.mbean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfilerController implements ProfilerControllerMBean {
    private boolean enabled = true;
}
