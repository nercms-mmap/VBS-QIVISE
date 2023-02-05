package whu.vbs.DRES.dev.dres.org.openapitools.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class QueryResultLog {
    public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
    @SerializedName("timestamp")
    private Long timestamp;
    public static final String SERIALIZED_NAME_SORT_TYPE = "sortType";
    @SerializedName("sortType")
    private String sortType;
    public static final String SERIALIZED_NAME_RESULT_SET_AVAILABILITY = "resultSetAvailability";
    @SerializedName("resultSetAvailability")
    private String resultSetAvailability;
    public static final String SERIALIZED_NAME_RESULTS = "results";
    @SerializedName("results")
    private List<QueryResult> results = new ArrayList();
    public static final String SERIALIZED_NAME_EVENTS = "events";
    @SerializedName("events")
    private List<QueryEvent> events = new ArrayList();

    public QueryResultLog() {
    }

    public QueryResultLog timestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = ""
    )
    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public QueryResultLog sortType(String sortType) {
        this.sortType = sortType;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = ""
    )
    public String getSortType() {
        return this.sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public QueryResultLog resultSetAvailability(String resultSetAvailability) {
        this.resultSetAvailability = resultSetAvailability;
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = ""
    )
    public String getResultSetAvailability() {
        return this.resultSetAvailability;
    }

    public void setResultSetAvailability(String resultSetAvailability) {
        this.resultSetAvailability = resultSetAvailability;
    }

    public QueryResultLog results(List<QueryResult> results) {
        this.results = results;
        return this;
    }

    public QueryResultLog addResultsItem(QueryResult resultsItem) {
        this.results.add(resultsItem);
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = ""
    )
    public List<QueryResult> getResults() {
        return this.results;
    }

    public void setResults(List<QueryResult> results) {
        this.results = results;
    }

    public QueryResultLog events(List<QueryEvent> events) {
        this.events = events;
        return this;
    }

    public QueryResultLog addEventsItem(QueryEvent eventsItem) {
        this.events.add(eventsItem);
        return this;
    }

    @ApiModelProperty(
            required = true,
            value = ""
    )
    public List<QueryEvent> getEvents() {
        return this.events;
    }

    public void setEvents(List<QueryEvent> events) {
        this.events = events;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            QueryResultLog queryResultLog = (QueryResultLog)o;
            return Objects.equals(this.timestamp, queryResultLog.timestamp) && Objects.equals(this.sortType, queryResultLog.sortType) && Objects.equals(this.resultSetAvailability, queryResultLog.resultSetAvailability) && Objects.equals(this.results, queryResultLog.results) && Objects.equals(this.events, queryResultLog.events);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.timestamp, this.sortType, this.resultSetAvailability, this.results, this.events});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryResultLog {\n");
        sb.append("    timestamp: ").append(this.toIndentedString(this.timestamp)).append("\n");
        sb.append("    sortType: ").append(this.toIndentedString(this.sortType)).append("\n");
        sb.append("    resultSetAvailability: ").append(this.toIndentedString(this.resultSetAvailability)).append("\n");
        sb.append("    results: ").append(this.toIndentedString(this.results)).append("\n");
        sb.append("    events: ").append(this.toIndentedString(this.events)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
