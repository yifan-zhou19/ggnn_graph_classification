public class student
{
	public int num;
	public float chinese;
	public float math;
	public float sum;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int n;
		 int i;
		 student pt;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 student * p = new student();
		 student temp = new student();
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 pt = (student)malloc(n * LEN);
		 for (p = pt;p < pt + n;p++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 p.num = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 p.chinese = Float.parseFloat(tempVar3);
			 }
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 p.math = Float.parseFloat(tempVar4);
			 }
			 p.sum = p.chinese + p.math;
		 }

		 for (i = 0;i < 3;i++)
		 {
			 for (p = pt;p < pt + n - 1 - i;p++)
			 {
				 if (p.sum >= (p + 1).sum)
				 {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=*p;
					 temp.copyFrom(p);
					 *p = (p + 1);
					 *(p + 1) = temp;
				 }
			 }
		 }
		 for (p = pt + n - 1;p > pt + n - 4;p--)
		 {
			 System.out.printf("%d %g\n",p.num,p.sum);
		 }
	}
}

