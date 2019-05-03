/*
 * Copyright 2018 Schibsted ASA.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.igor.travis.client.model.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.netflix.spinnaker.igor.travis.client.model.Job;
import java.util.List;
import org.simpleframework.xml.Default;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Default
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@Root(strict = false)
public class V3Builds {
  @ElementList(required = false, name = "builds", inline = true)
  private List<V3Build> builds;

  @ElementList(required = false, name = "jobs", inline = true)
  private List<Job> jobs;

  @ElementList(required = false, name = "commits", inline = true)
  private List<V3Commit> commits;

  public List<V3Build> getBuilds() {
    return builds;
  }

  public void setBuilds(List<V3Build> builds) {
    this.builds = builds;
  }

  public List<Job> getJobs() {
    return jobs;
  }

  public void setJobs(List<Job> jobs) {
    this.jobs = jobs;
  }

  public List<V3Commit> getCommits() {
    return commits;
  }

  public void setCommits(List<V3Commit> commits) {
    this.commits = commits;
  }
}
