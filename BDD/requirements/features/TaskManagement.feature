Feature: 管理团队的任务
	description
	In Order to ：
	As a ...:
	I Want to：

Scenario: 有未完成的任务
	Given 团队有任务 "Task1"
	Given 团队有任务 "Task2"
	Given 团队有任务 "Task3"
	When  团队完成任务"Task3"
	Then  团队去做下一个Feature