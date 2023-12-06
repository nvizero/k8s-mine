### 用helm 安裝 loki & promatil 

```
helm repo add grafana https://grafana.github.io/helm-charts

helm repo update

helm install loki grafana/loki-stack

```

### 因為loki && promatil己用helm佈暑好

#### 所以只用ingress就好
