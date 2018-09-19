//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
	public int num;
	   public String name = new String(new char[27]);
}
//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass2:
public class AnonymousClass2
{
	public int cishu;
}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass[] book = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(999);
	public static AnonymousClass2[] ren = tangible.Arrays.initializeWithDefaultAnonymousClass2Instances(26);
	public static int Main()
	{
		int n;
		int zimu;
		int a;
		int b;
		int i;
		int j;
		int[] sz = new int[26];
		char m;
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
				book[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				book[i].name = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;book[i].name.charAt(j) != '\0';j++)
			{
				   zimu = book[i].name.charAt(j) - 65;
				   ren[zimu].cishu++;
			}
		}
		a = 0;
		b = ren[0].cishu;
		for (i = 1;i < 26;i++)
		{
		   if (ren[i].cishu > b)
		   {
			   a = i;
			   b = ren[i].cishu;
		   }

		}
		m = a + 65;
		System.out.printf("%c\n",m);
		System.out.printf("%d\n",b);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (book[i].name.charAt(j) == m)
				{
				   System.out.printf("%d\n",book[i].num);
				}
			}
		}

		return 0;
	}

}

