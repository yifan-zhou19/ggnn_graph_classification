package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int num;
	//		char wri[26];
	//	}
	//	*s;
		int n;
		int i;
		int j;
		int[] a = new int[100];
		int t;
		char c;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		s = (book)malloc(n * sizeof(book));

		for (i = 0;i < 100;i++)
		{
			a[i] = 0;
		}
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
				(*(s + i)).num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(*(s + i)).wri = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
		for (j = 0;(*(s + i)).wri[j] != '\0';j++)
		{
			for (c = 'A';c <= 'Z';c++)
			{
				if (s[i].wri[j] == c)
				{
					a[s[i].wri[j]]++;
				}
			}
		}
		}
		for (i = 0;i < 100;i++)
		{
			if (a[0] < a[i])
			{
			a[0] = a[i];
			t = i;
			}
		}
		System.out.printf("%c\n",t);
			 System.out.printf("%d\n",a[t]);
		for (i = 0;i < n;i++)
		{
			for (j = 0;(*(s + i)).wri[j] != '\0';j++)
			{
				if (s[i].wri[j] == t)
				{
					System.out.printf("%d\n",s[i].num);
				}
			}
		}

	}



}

