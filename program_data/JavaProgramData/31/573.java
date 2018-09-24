public class student
{
	public String stu = new String(new char[100]);
}

package <missing>;

public class GlobalMembers
{
	public static student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(10000);
	public static void Main()
	{
		int i;
		int j;
		for (i = 0;;i++)
		{
			a[i].stu = new Scanner(System.in).nextLine();
			if (a[i].stu.charAt(0) == 'e')
			{
				a[i].stu = tangible.StringFunctions.changeCharacter(a[i].stu, 0, '\0');
				break;
			}
		}
		for (j = i;j >= 0;j--)
		{
			System.out.println(a[j].stu);
		}
	}



}

