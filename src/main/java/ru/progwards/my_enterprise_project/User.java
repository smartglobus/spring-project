package ru.progwards.my_enterprise_project;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private String name;
    private Role role;
    private List<ProjectRules> rules;

    public User(String id, String name, Role role) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.rules = new ArrayList<>();
    }

    //getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    public List<ProjectRules> getRules() {
        return rules;
    }

    //setters
    public User setId(String id) {
        this.id = id;
        return this;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public User setRole(Role role) {
        this.role = role;
        return this;
    }

    public User setRules(List<ProjectRules> rules) {
        this.rules = rules;
        return this;
    }

//    public User addRule(ProjectRules rule) {
//        if (!rules.contains(rule))
//            rules.add(rule);
//        return this;
//    }
//
//    public User deleteRule(ProjectRules rule){
//        rules.remove(rule);
//        return this;
//    }
}
