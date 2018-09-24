public class list
{
	public int num;
	public String author = new String(new char[26]);
}

public class number
{
	public int a;
	public int time;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int k;
		int length;
		list[] book = tangible.Arrays.initializeWithDefaultlistInstances(100);
		number[] name = tangible.Arrays.initializeWithDefaultnumberInstances(26);
		number most = new number();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				book[i].author = tempVar3.charAt(0);
			}
		}

		for (i = 0;i < 26;i++)
		{
			name[i].a = i;
			name[i].time = 0;
		}

		for (i = 0;i < m;i++)
		{
			length = String.valueOf(book[i].author).length();
			for (j = 0;j < length;j++)
			{
				k = (book[i].author.charAt(j));
				name[k - 65].time++;
			}
		}

//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: most=name[0];
		most.copyFrom(name[0]);

		for (i = 1;i < 26;i++)
		{
			if (name[i].time > most.time)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: most=name[i];
				most.copyFrom(name[i]);
			}
		}

		System.out.printf("%c\n%d\n",most.a + 65,most.time);

		for (i = 0;i < m;i++)
		{
			length = String.valueOf(book[i].author).length();

			for (j = 0;j < length;j++)
			{
				k = (book[i].author.charAt(j));
				if (most.a + 65 == k)
				{
					System.out.printf("%d\n",book[i].num);
				}
			}
		}
		return 0;
	}






}

