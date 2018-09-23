package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int number;
	//		char author[10];
	//	};
		book[] a = tangible.Arrays.initializeWithDefaultbookInstances(1000);
		int i;
		int n;
		int j;
		int[] count = new int[26];
		int temp;
		int max;
		int index = 0;
		char c;
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
			a[i].number = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			a[i].author = tempVar3;
		}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;a[i].author[j] != '\0';j++)
			{
				temp = (a[i].author[j]) - 'A';
				count[temp]++;
			}
		}
		 max = count[0];
		 for (i = 1;i < 26;i++)
		 {
			 if (count[i] > max)
			 {
				 max = count[i];
				 index = i;
			 }
		 }
		c = index + 'A';
		System.out.printf("%c\n%d\n",c,max);
			 for (i = 0;i < n;i++)
			 {
				 for (j = 0;a[i].author[j] != '\0';j++)
				 {
					 if (a[i].author[j] == c)
					 {
						 System.out.printf("%d\n",a[i].number);
					 }
				 }
			 }
	}

}

