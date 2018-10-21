package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct shu
	//	{
	//		int z;
	//		struct shu *next;
	//	}
	//	*shu,*header;
		int n;
		int m;
		int i;
		int d = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("""");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		shu = (shu)malloc(sizeof(shu) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(shu[i].z) = tempVar3;
			}
		}
		header = &shu[n - m];
		for (i = n - m;i < n - 1;i++)
		{
			shu[i].next = &shu[i + 1];
		}
		shu[n - 1].next = &shu[0];
		for (i = 0;i < n - m - 1;i++)
		{
			shu[i].next = &shu[i + 1];
		}
		shu[n - m - 1].next = null;
		shu p;
		p = header;
		while (p != null)
		{
			System.out.printf("%d",p.z);
			p = p.next;
			if (d < n)
			{
				System.out.print(" ");
			}
			d++;
		}
		shu = null;

		return 0;

	}

}

