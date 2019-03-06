
### Create SNS topic
```sh
$ aws --endpoint-url=http://localhost:4575 sns create-topic --name <TOPIC NAME>
```

### Create SQS queue
```sh
$ aws --endpoint-url=http://localhost:4576 sqs create-queue --queue-name <QUEUE NAME>
```

### Subscribe SQS -> SNS
```sh
$ aws --endpoint-url=http://localhost:4575 sns subscribe --topic-arn <TOPIC ARN> --protocol sqs --notification-endpoint <QUEUE ENDPOINT>
```

### Publish message
```sh
$ aws --endpoint-url=http://localhost:4575 sns publish --topic-arn <TOPIC ARN> --message Hello
```
