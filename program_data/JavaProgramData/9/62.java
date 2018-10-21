public class bingren
{
	public String id = new String(new char[20]);
	public int age;
}

public class laoren
{
	public String oid = new String(new char[20]);
	public int oage;
}

package <missing>;

public class GlobalMembers
{
	public static bingren[] bing =
	{
		new bingren('\0', 0),
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null
	};
	public static laoren[] lao =
	{
		new laoren('\0', 0),
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null,
		null
	};

	public static void Main()
	{
		int n;
		int i;
		int j = 0;
		int l;
		laoren temp = new laoren();
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
				bing[i].id = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				bing[i].age = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (bing[i].age >= 60)
			{
				lao[j].oid = bing[i].id;
				lao[j].oage = bing[i].age;
				bing[i].age = -1;
				j++;
			}
			else
			{
				continue;
			}
		}
		for (l = 0;l < j;l++)
		{
			for (i = 0;i < j - l;i++)
			{
				if (lao[i].oage < lao[i + 1].oage)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=lao[i];
					temp.copyFrom(lao[i]);
					lao[i] = lao[i + 1];
					lao[i + 1] = temp;
				}
			}
		}
		for (i = 0;i < j + 1;i++)
		{
			System.out.printf("%s\n", lao[i].oid);
		}
		for (i = 0;i < n;i++)
		{
			if (bing[i].age >= 0)
			{
				System.out.printf("%s\n", bing[i].id);
			}
			else
			{
				continue;
			}
		}
	}

}

