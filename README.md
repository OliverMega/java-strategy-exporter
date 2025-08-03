# 📦 Java Strategy Pattern - Note Exporter

這是一個使用 Java 策略模式（Strategy Pattern）設計的小型專案，支援將筆記（Note）匯出為多種格式。

## 🧠 技術學習目標

- 熟悉 Java Interface 與實作
- 理解並應用策略模式（Strategy Pattern）
- 學習如何管理行為變化（如匯出格式）

## ✅ 支援的匯出格式

- Plain Text (`PlainTextExport`)
- JSON (`JsonExport`)
- CSV (`CsvExport`)
- Markdown (`MarkdownExport`)

## 🚀 執行方式

```bash
javac *.java
java StrategyExportTest


[Plain Text] 會議-明天要開會
{ "title": "會議", "content": "明天要開會"  }
title,content,createAt,labeling
會議,明天要開會,2025-08-04,工作
# title: 會議
 - Content: 明天要開會
 - Created At: 2025-08-04
 - Labeling: 工作
