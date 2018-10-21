public class chil
{
	public int sex;
	public int num;
}
public class student
{
	public int b;
	public int g;
}

package <missing>;

public class GlobalMembers
{
	public static chil[] child = tangible.Arrays.initializeWithDefaultchilInstances(100);
	public static student[] girl = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static void bubble(student[] a, int len)
	{
		int i;
		int j;
		student temp = new student();
		for (j = 1; j < len; j++)
		{
			for (i = 0; i < len - j; i++)
			{
				if (a[i].g > a[i + 1].g)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=a[i];
					temp.copyFrom(a[i]);
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
		}
	}
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		String s = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		n = s.length();
		child[0].sex = 1;
		child[0].num = 0;
		for (i = 1; i < n; i++)
		{
			if (s.charAt(i) == s.charAt(0))
			{
				child[i].sex = 1;
				child[i].num = i;
			}
			else
			{
				child[i].sex = 0;
				child[i].num = i;
			}
		} //??????
		for (i = 0, j = 0; i < n; i++)
		{
			if (child[i].sex == 1 && child[i + 1].sex == 0)
			{
				girl[j].b = child[i].num;
				girl[j].g = child[i + 1].num;
				j++;
				for (k = i; (k + 2) < n; k++)
				{
					child[k] = child[k + 2];
				}
				n = n - 2;
				i = -1;
			}
		}
		bubble(girl, j);
		for (i = 0; i < j; i++)
		{
			System.out.printf("%d %d\n",girl[i].b,girl[i].g);
		}
	}
}

