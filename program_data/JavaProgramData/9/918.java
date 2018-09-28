public class sick
{
	public String name = new String(new char[10]);
public int age;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int count = 0;
		int j;
		sick[] s = tangible.Arrays.initializeWithDefaultsickInstances(100);
		sick[] a = tangible.Arrays.initializeWithDefaultsickInstances(100);
		sick t = new sick();
		String b = new String(new char[3]);
		b = new Scanner(System.in).nextLine();
		n = Integer.parseInt(b);
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s[i].name = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				s[i].age = Integer.parseInt(tempVar2);
			}
		}
		if (n == 1)
		{
			System.out.printf("%s",s[0].name);
		}
		else
		{
			for (i = 0;i < n;i++)
			{
			if (s[i].age >= 60)
			{
				a[count] = s[i];
			count++;
			}
			}
			for (i = 0;i < count - 1;i++)
			{
				for (j = 0;j < count - 1 - i;j++)
				{
					if (a[j].age < a[j + 1].age)
					{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: t=a[j];
						t.copyFrom(a[j]);
						a[j] = a[j + 1];
						a[j + 1] = t;
					}
				}
			}
		for (i = 0;i < count;i++)
		{
			System.out.printf("%s\n",a[i].name);
		}
		for (i = 0;i < n;i++)
		{
			if (s[i].age < 60)
			{
				System.out.printf("%s\n",s[i].name);
			}
		}
		}
			return 0;
	}

}

