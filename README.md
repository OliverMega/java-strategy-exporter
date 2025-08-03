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


輸出範例
txt
複製
編輯
[Plain Text] 會議-明天要開會
{ "title": "會議", "content": "明天要開會"  }
title,content,createAt,labeling
會議,明天要開會,2025-08-04,工作
# title: 會議
 - Content: 明天要開會
 - Created At: 2025-08-04
 - Labeling: 工作


 作者學習心得
嘗試實作多種策略並切換匯出方式

第一次用 exportAll 批次處理時卡住，後來靠 Copilot 引導與自己逐行理解解決

收穫：學到策略模式、Java 介面、設計鬆耦合架構
