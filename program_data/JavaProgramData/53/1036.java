package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		String p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p = (String)calloc(n,(Character.SIZE / Byte.SIZE));
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(p.Substring(i)) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (*(p.Substring(j)) == *(p.Substring(i)))
				{
					*(p.Substring(j)) = ' ';
				}
			}
		}
		System.out.printf("%d", p);
		for (i = 1;i < n;i++)
		{
			if (*(p.Substring(i)) != ' ')
			{
				System.out.printf(",%d",*(p.Substring(i)));
			}
		}
	}
}

