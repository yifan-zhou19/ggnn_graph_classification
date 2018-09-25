//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass
{
	public int xuehao;
	public int yuwen;
	public int shuxue;
}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass[] student = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(1000000);
	public static void swap(tangible.RefObject<Integer> a, tangible.RefObject<Integer> b)
	{
		int e;
		e = a.argValue;
		a.argValue = b.argValue;
		b.argValue = e;
	}
	public static void Main(String[] args)
	{
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i = 0;
		int j = 0;
		int[] total = new int[1000000];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				student[i].xuehao = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				student[i].yuwen = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				student[i].shuxue = Integer.parseInt(tempVar4);
			}
			total[i] = student[i].yuwen + student[i].shuxue;
		}
		for (i = 0;i < 3;i++)
		{
			for (j = n - 1;j > 0 + i;j--)
			{
				if (total[j] > total[j - 1])
				{
					swap(total[j], total[j - 1]);
					swap(student[j - 1].xuehao, student[j].xuehao);
						swap(student[j - 1].yuwen, student[j].yuwen);
						swap(student[j - 1].shuxue, student[j].shuxue);
				}
			}
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",student[i].xuehao,total[i]);
		}
	}
}

