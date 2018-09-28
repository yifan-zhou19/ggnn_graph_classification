public class Student
{
	public String name = new String(new char[20]);
	public int sco;
	public int com;
	public char cad;
	public char prov;
	public int num;
}

package <missing>;

public class GlobalMembers
{
	public static void count_date(Student p, int[] a, int n)
	{
		int i;
		int sum;
		for (i = 1;i <= n;i++)
		{
			sum = 0;
			if ((p + i - 1).sco > 80 && (p + i - 1).num >= 1)
			{
				sum = sum + 8000;
			}
			if ((p + i - 1).sco > 85 && (p + i - 1).com > 80)
			{
				sum = sum + 4000;
			}
			if ((p + i - 1).sco > 90)
			{
				sum = sum + 2000;
			}
			if ((p + i - 1).sco > 85 && (p + i - 1).prov == 'Y')
			{
				sum = sum + 1000;
			}
			if ((p + i - 1).com > 80 && (p + i - 1).cad == 'Y')
			{
				sum = sum + 850;
			}
			a[i - 1] = sum;
		}
	}
	public static int compare_date(int[] a, int n)
	{
		int i;
		int k;
		int max;
		max = a[0];
		k = 1;
		for (i = 2;i <= n;i++)
		{
			if (max < a[i - 1])
			{
				max = a[i - 1];
				k = i;
			}
		}
		return k;
	}
	public static int Main()
	{
		int n;
		int len;
		int i;
		int[] a;
		int top;
		int sum = 0;
		Student p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		len = sizeof(Student);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p = (Student)calloc(len,n);
		a = new int[4];
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(p + i - 1).name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(p + i - 1).sco = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				(p + i - 1).com = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				(p + i - 1).cad = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				(p + i - 1).prov = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				(p + i - 1).num = Integer.parseInt(tempVar7);
			}
		}
		count_date(p, a, n);
		top = compare_date(a, n);
		for (i = 1;i <= n;i++)
		{
			sum = sum + a[i - 1];
		}
		System.out.printf("%s\n%d\n%d",(p + top - 1).name,a[top - 1],sum);
		return 0;
	}





}

