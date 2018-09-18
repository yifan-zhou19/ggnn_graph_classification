public class Student
{ //?????
	public int nID;
	public int nChinese;
	public int nMath;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n; //a1,a2,a3????????ID?t1,t2,t3????
		int i;
		int a1;
		int a2;
		int a3;
		int t1;
		int t2;
		int t3;
		int t;
		Student students = new Student();
		t1 = 0;
		t2 = 0;
		t3 = 0;
		a1 = 0;
		a2 = 0;
		a3 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				students.nID = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				students.nChinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				students.nMath = Integer.parseInt(tempVar4);
			}
			t = students.nChinese + students.nMath;
			if (t > t1)
			{ //????????????
				t3 = t2;
				a3 = a2; //???????????
				t2 = t1;
				a2 = a1; //???????????
				t1 = t;
				a1 = students.nID;
			}
			else
			{
				if (t > t2)
				{ //?????????????????????
					t3 = t2;
					a3 = a2; //???????????
					t2 = t;
					a2 = students.nID;
				}
				else
				{
					if (t > t3)
					{
						t3 = t;
						a3 = students.nID;
					}
				}
			}
		}
		System.out.printf("%d%s%d\n",a1," ",t1);
		System.out.printf("%d%s%d\n",a2," ",t2);
		System.out.printf("%d%s%d\n",a3," ",t3);
	}


}

