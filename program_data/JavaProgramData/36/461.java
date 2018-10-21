package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int l1;
		int l2;
		int c = 0;
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
		l1 = a.length();
		l2 = b.length();
		if (l2 != l1)
		{
			System.out.print("NO");
		}
		else
		{
				for (i = 0;i < l1;i++)
				{
			for (j = 0;j < l2;j++)
			{
				if (a.charAt(i) == b.charAt(j))
				{
					c++;
					b = tangible.StringFunctions.changeCharacter(b, j, '\0');
					break;
				}
			}
				}
		if (c == l1)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
		}
	}
}

