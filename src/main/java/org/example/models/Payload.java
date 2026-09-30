
package org.example.models;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "repository_id",
    "push_id",
    "ref",
    "head",
    "before"
})
@Generated("jsonschema2pojo")
public class Payload {

    @JsonProperty("repository_id")
    private Integer repositoryId;
    @JsonProperty("push_id")
    private Long pushId;
    @JsonProperty("ref")
    private String ref;
    @JsonProperty("head")
    private String head;
    @JsonProperty("before")
    private String before;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("repository_id")
    public Integer getRepositoryId() {
        return repositoryId;
    }

    @JsonProperty("repository_id")
    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    @JsonProperty("push_id")
    public Long getPushId() {
        return pushId;
    }

    @JsonProperty("push_id")
    public void setPushId(Long pushId) {
        this.pushId = pushId;
    }

    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    @JsonProperty("ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

    @JsonProperty("head")
    public String getHead() {
        return head;
    }

    @JsonProperty("head")
    public void setHead(String head) {
        this.head = head;
    }

    @JsonProperty("before")
    public String getBefore() {
        return before;
    }

    @JsonProperty("before")
    public void setBefore(String before) {
        this.before = before;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Payload.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("repositoryId");
        sb.append('=');
        sb.append(((this.repositoryId == null)?"<null>":this.repositoryId));
        sb.append(',');
        sb.append("pushId");
        sb.append('=');
        sb.append(((this.pushId == null)?"<null>":this.pushId));
        sb.append(',');
        sb.append("ref");
        sb.append('=');
        sb.append(((this.ref == null)?"<null>":this.ref));
        sb.append(',');
        sb.append("head");
        sb.append('=');
        sb.append(((this.head == null)?"<null>":this.head));
        sb.append(',');
        sb.append("before");
        sb.append('=');
        sb.append(((this.before == null)?"<null>":this.before));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.repositoryId == null)? 0 :this.repositoryId.hashCode()));
        result = ((result* 31)+((this.pushId == null)? 0 :this.pushId.hashCode()));
        result = ((result* 31)+((this.head == null)? 0 :this.head.hashCode()));
        result = ((result* 31)+((this.ref == null)? 0 :this.ref.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.before == null)? 0 :this.before.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Payload) == false) {
            return false;
        }
        Payload rhs = ((Payload) other);
        return (((((((this.repositoryId == rhs.repositoryId)||((this.repositoryId!= null)&&this.repositoryId.equals(rhs.repositoryId)))&&((this.pushId == rhs.pushId)||((this.pushId!= null)&&this.pushId.equals(rhs.pushId))))&&((this.head == rhs.head)||((this.head!= null)&&this.head.equals(rhs.head))))&&((this.ref == rhs.ref)||((this.ref!= null)&&this.ref.equals(rhs.ref))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.before == rhs.before)||((this.before!= null)&&this.before.equals(rhs.before))));
    }

}
