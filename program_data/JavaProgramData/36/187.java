package <missing>;

public class GlobalMembers
{
	public static int length;
	public static int tj(String str, char x)
	{
		int i;
		int count = 0;
		for (i = 0;i < length;i++)
		{
			if (str[i].equals(x))
			{
				count++;
			}
		}
		return (count);
	}
	public static void Main()
	{
		int i;
		int p = 1;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		if (a.length() != b.length())
		{
			p = 0;
		}
		else
		{
			length = a.length();
		for (i = 0;i < length;i++)
		{
			if (tj(a, a.charAt(i)) != tj(b, a.charAt(i)))
			{
				p = 0;
				break;
			}
		}
		}
		if (p == 1)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
	}
}

