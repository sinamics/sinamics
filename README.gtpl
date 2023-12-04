<p align="center">
  <ul>
    <li>👋 Hi, I’m @sinamics</li>
    <li>👀 I’m interested in programming</li>
    <li>🌱 I’m currently learning kubernetes</li>
    <li>💞️ I’m looking to collaborate on fun projects</li>
    <li>📫 How to reach me https://egeland.io</li>
  </ul>
</p>

### 📈 GitHub Statistics 📉
<img align="center" src="https://githubreadme.egeland.io/?username=sinamics&show_icons=true&theme=ayu-mirage" />
<img align="center" src="https://githubreadme.egeland.io/top-langs/?username=sinamics&theme=ayu-mirage&layout=compact" />

### 👷 Check out what I'm currently working on
{{range recentContributions 10}}
- [{{.Repo.Name}}]({{.Repo.URL}}) - {{.Repo.Description}} ({{humanize .OccurredAt}})
{{- end}}

#### 🌱 My latest projects
{{range recentRepos 10}}
- [{{.Name}}]({{.URL}}) - {{.Description}}
{{- end}}

#### 🔭 Latest releases I've contributed to
{{range recentReleases 10}}
- [{{.Name}}]({{.URL}}) ([{{.LastRelease.TagName}}]({{.LastRelease.URL}}), {{humanize .LastRelease.PublishedAt}}) - {{.Description}}
{{- end}}

#### 🔨 My recent Pull Requests
{{range recentPullRequests 10}}
- [{{.Title}}]({{.URL}}) on [{{.Repo.Name}}]({{.Repo.URL}}) ({{humanize .CreatedAt}})
{{- end}}

#### 📓 Gists I wrote
{{range gists 5}}
- [{{.Description}}]({{.URL}}) ({{humanize .CreatedAt}})
{{- end}}

#### ⭐ Recent Stars
{{range recentStars 10}}
- [{{.Repo.Name}}]({{.Repo.URL}}) - {{.Repo.Description}} ({{humanize .StarredAt}})
{{- end}}

#### 👯 Check out some of my recent followers
{{range followers 5}}
- [{{.Login}}]({{.URL}})
{{- end}}
