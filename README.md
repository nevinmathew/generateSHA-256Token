# SHA-256 Token Generator

This is a simple Java project for generating SHA-256 tokens using the HMAC-SHA-256 algorithm. This project provides a basic example of how to create a token using a secret key and a message.

## Usage

The Token Generator demonstrates how to create a SHA-256 HMAC token. You can customize it for your own use by modifying the following parts of the code:

• `asciiCs.encode("key").array()` - Replace `"key"` with your secret key.
• `asciiCs.encode("The quick brown fox jumps over the lazy dog").array()` - Replace the message with the data you want to hash.

## Example

After running the Token Generator, you will get a SHA-256 HMAC token printed in the console.
