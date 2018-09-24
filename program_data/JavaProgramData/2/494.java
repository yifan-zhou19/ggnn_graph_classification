package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int bianhao;
	//		char zuozhe[100];
	//	}
	//	a[1000];
		int i;
		int j;
		int n;
		int l;
		int max;
		int[] b = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].bianhao = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].zuozhe = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
		  for (j = 0;a[i].zuozhe[j] != '\0';j++)
		  {
			b[a[i].zuozhe[j] - 65]++;
		  }
		}
		max = b[0];
		l = 0;
		for (i = 1;i <= 25;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
				l = i;
			}
		}
		System.out.printf("%c\n",l + 65);
		System.out.printf("%d\n",max);
		for (i = 0;i < n;i++)
		{
			for (j = 0;a[i].zuozhe[j] != '\0';j++)
			{
				if (a[i].zuozhe[j] == (l + 65))
				{
					System.out.printf("%d\n",a[i].bianhao);
					break;
				}
			}
		}
	}






}

