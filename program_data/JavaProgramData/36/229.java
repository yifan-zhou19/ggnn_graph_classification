package <missing>;

public class GlobalMembers
{
	public static int p(int i)
	{
		 int j;
		 int flag1 = 0;
		 for (j = 0;j < l;j++)
		 {
			 if (a.charAt(i) == b.charAt(j))
			 {
			 flag1 = 1;
			 b = b.substring(0, j);
			 break;
			 }
		 }
		 if (flag1 == 0)
		 {
			 return 0;
		 }
		 else
		 {
			 return 1;
		 }
	}
	public static String a = new String(new char[100]);
	public static String b = new String(new char[100]);
	public static int l;
	public static void Main(String[] args)
	{
		int i;
		int flag = 1;
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
		l = b.length();
		for (i = 0;i < a.length();i++)
		{
			if (p(i) == 0)
			{
			flag = 0;
			break;
			}
		}
		for (i = 0;i < l;i++)
		{
			if (b.charAt(i) != 0)
			{
			flag = 0;
			break;
			}
		}
		if (flag == 1)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
	}
}

