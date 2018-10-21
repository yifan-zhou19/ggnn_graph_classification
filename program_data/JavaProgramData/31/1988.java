public class student
{
			   public String info = new String(new char[100]);
			   public student before;
}

package <missing>;

public class GlobalMembers
{
				   public static student[] student = tangible.Arrays.initializeWithDefaultstudentInstances(10000);

	public static int Main()
	{
		void print(struct student * p);
		int i = 0;
		int j;
		char[][] a = new char[10000][100];
		a[0] = new Scanner(System.in).nextLine();
		while (a[i][0] != 'e')
		{
							student[i].info = a[i];
							i++;
							a[i] = new Scanner(System.in).nextLine();
		}
		student[0].before = null;
		for (j = 0;j <= i - 1;j++)
		{
						  student[j + 1].before = student[j];
		}
		print(student[i - 1]);
		return 0;
	}

	public static void print(student p)
	{
		 System.out.printf("%s\n", p.info);
		 if (p.before != null)
		 {
			 print(p.before);
		 }
	}

}

