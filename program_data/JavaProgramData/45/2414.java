package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String child = new String(new char[50]);
		String mother = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			child = tempVar.charAt(0);
		}
		System.in.read();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			mother = tempVar2.charAt(0);
		}
		int l = child.length();
		int ml = mother.length();
		int isbreak;
		int i;
		int k;
		for (i = 0;i + l <= ml;i++)
		{
			isbreak = 1;
			for (k = 0;k < l;k++)
			{
				if (child.charAt(k) != mother.charAt(k + i))
				{
					isbreak = 0;
					break;
				}
			}
			if (isbreak != 0)
			{
				System.out.printf("%d",i);
			}
		}
	}

}

