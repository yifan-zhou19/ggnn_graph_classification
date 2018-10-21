package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String p = a;
		int i;
		int f = 0;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		if (a.length() != b.length())
		{
			t = 1;
		 System.out.print("NO\n");
		}
		for (; p == '\0';p++)
		{
			for (i = 0;i < b.length();i++)
			{
			if (p == b.charAt(i))
			{
				f = 1;
			 b = b.substring(0, i);
			 break;
			}
			}
		 if (f == 0)
		 {
			 System.out.print("NO\n");
		  t = 1;
		  break;
		 }
		 else
		 {
			 f = 0;
		 }
		}
		if (t == 0)
		{
			System.out.print("YES\n");
		}
	}
}

