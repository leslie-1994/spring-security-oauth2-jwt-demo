package com.ljl.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Role implements GrantedAuthority {
  private static final long serialVersionUID = 8386864187793300772L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(nullable = false)
  private String name;

  @Override
  public String getAuthority() {
    return name;
  }
}
