package <missing>;

public class GlobalMembers
{
	public static void match(tangible.RefObject<String> s, tangible.RefObject<String> r, int len)
	{
	String stack = new String(new char[100]);
	char c;
	int top = 0;
	int pos;
	for (pos = 0;pos < len;++pos)
	{
	r.argValue.charAt(pos) = ' ';
	}
	r.argValue.charAt(len) = '\0';
	for (pos = 0;pos < len;++pos)
	{
	c = s.argValue.charAt(pos);
	if (c == '(')
	{
		stack = tangible.StringFunctions.changeCharacter(stack, top++, pos);
	}
	else if (c == ')')
	{
	if (top > 0)
	{
		top--;
	}
	else
	{
		r.argValue.charAt(pos) = '?';
	}
	}
	}
	while (top > 0)
	{
		pos = stack.charAt(--top);
	r.argValue.charAt(pos) = '$';
	}
	}
	public static void outresult(String s, String r)
	{
		System.out.println(s);
		System.out.println(r);
	}
	public static int Main()
	{
	String line = new String(new char[101]);
	String result = new String(new char[101]);
	char ch;
	int pos = 0;
	while ((ch = System.in.read()) != EOF)
	{
	if (ch != '\n')
	{
		line = tangible.StringFunctions.changeCharacter(line, pos++, ch);
	}
	else
	{
		line = tangible.StringFunctions.changeCharacter(line, pos, '\0');
tangible.RefObject<String> tempRef_line = new tangible.RefObject<String>(line);
tangible.RefObject<String> tempRef_result = new tangible.RefObject<String>(result);
	match(tempRef_line, tempRef_result, pos);
	result = tempRef_result.argValue;
	line = tempRef_line.argValue;
	outresult(line, result);
	pos = 0;
	}
	}
	return 0;
	}
}

