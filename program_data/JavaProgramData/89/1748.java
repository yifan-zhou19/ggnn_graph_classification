package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] renshi = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(renshi,0,(Integer.SIZE / Byte.SIZE) * n);
		int[] beiren = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(beiren,0,(Integer.SIZE / Byte.SIZE) * n);
		while (true)
		{
			int a;
			int b;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a == 0 && b == 0)
			{
				break;
			}
			renshi[a]++;
			beiren[b]++;
		}
		for (i = 0;i < n;i++)
		{
			if (renshi[i] == 0 && beiren[i] == n - 1)
			{
				System.out.printf("%d\n",i);
				break;
			}
		}
		if (i == n)
		{
			System.out.print("NOT FOUND\n");
		}
	}
}

