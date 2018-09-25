package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String c = new String(new char[31]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 char * p = c;
		 int[] a = new int[31];
		 int[] q = a;
		 int num = 0;
		 int i;
		 c = new Scanner(System.in).nextLine();
		 for (; * p != '\0'; p++)
		 {
			   if (*p >= '0' && *p <= '9')
			   {
					q[0] = (*p) - '0';
					p++;
					while (*p >= '0' && *p <= '9')
					{
								  q[0] = q * 10 + (*(p++) - '0');
					}
					num = 1 + num;
					q = 1 + q;
			   }
		 }
		 for (i = 0,q = a; i < num; i++,q++)
		 {
		 System.out.print(q);
		 System.out.print("\n");
		 }
		 return 0;
	}

}
