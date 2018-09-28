public class stu
{
	public int num;
public int sex;
}

package <missing>;

public class GlobalMembers
{
	public static int l;
	public static stu[] a = tangible.Arrays.initializeWithDefaultstuInstances(100);
	public static int Main()
	{
		String s = new String(new char[101]);
		char p;
	int i;
	int j;
	int L;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s = tempVar.charAt(0);
	}
	l = s.length();
	p = s.charAt(0);
	for (i = 0;i < l;i++)
	{
		if (s.charAt(i) == p)
		{
	a[i].sex = 1;
		}
	else
	{
		a[i].sex = 2;
	}
	a[i].num = i;
	}
	L = l / 2;
	for (i = 0;i < L;i++)
	{
		for (j = 0;j < l;j++)
		{
		k = j + 1;
	while (a[k].sex == 0)
	{
		k++;
	}
		if (a[j].sex == 1 && a[k].sex == 2)
		{
		System.out.printf("%d %d\n",a[j].num,a[k].num);
	a[j].sex = a[k].sex = 0;
	break;
		}
		}
	}
	}

}

