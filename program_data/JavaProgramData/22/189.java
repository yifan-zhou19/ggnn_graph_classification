public class pp
{
	public int a;
	public char b;
}

package <missing>;

public class GlobalMembers
{
	public static pp[] st = tangible.Arrays.initializeWithDefaultppInstances(100);

	public static void Main()
	{
		pp o = new pp();
	int n;
	int i = 0;
	int j;
	int s;
	int k;
	int l;
	float t;



	while (true)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		st[i].a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(null, 1);
	if (tempVar2 != null)
	{
		st[i].b = tempVar2.charAt(0);
	}
	if (st[i].b != ',')
	{
		break;
	}
	i++;
	}
	s = i + 1;

	for (i = 0;i < s;i++)
	{
		for (j = 0;j < s - i;j++)
		{
			if (st[j].a < st[j + 1].a)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: o=st[j];
			 o.copyFrom(st[j]);
			 st[j] = st[j + 1];
			 st[j + 1] = o;
			}
		}
	}

			i = 0;
			while (st[i].a == st[0].a)
			{
				i++;
			}

			if (s == 1 || i >= s)
			{
			  System.out.print("No");
			}


			else
			{
			 System.out.printf("%d",st[i].a);
			}


	}
}

