package <missing>;

public class GlobalMembers
{
	public static int hw(String w)
	{
	int l = w.length();
//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right shift operator since the left operand was not confirmed to be of an unsigned type, but you should review whether the logical right shift operator (>>>) is more appropriate:
	for (int i = l >> 1 - 1;i >= 0;i--)
	{
	if (!w[i].equals(w[l - i - 1]))
	{
		return 0;
	}
	}
	return 1;
	}
	public static int Main()
	{
	String w = new String(new char[10000]);
	String p = new String(new char[10000]);
	w = ConsoleInput.readToWhiteSpace(true).charAt(0);
	int l = w.length();
	for (int j = 2;j < l;j++)
	{
	for (int i = 0;i < l - j + 1;i++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
	memcpy(p, w.charAt(i), j);
	p = p.substring(0, j);
	if (hw(p) != 0)
	{
		System.out.print(p);
		System.out.print("\n");
	}
	}
	}
	return 0;
	}
}

