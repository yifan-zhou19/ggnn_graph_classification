package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[1000]);
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		String p3;
		String q1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		String q2;
		int S;
		int A;
		int i;
		int j;

		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		S = s.length();
		A = a.length();

		q = p1 = s;
		q2 = p2 = a;
		p3 = b;

		for (i = 0;i < S;i++,p1++)
		{
			if (*p1 == *p2 && (*(p1 - 1) == ' ' || p1 == s))
			{
				q1 = p1;
			 for (j = 0;j < A;j++,p2++,p1++)
			 {
			   if (*p1 != *p2)
			   {
			   break;
			   }
			  else if (j == A - 1 && (*(p1 + 1) == ' ' || *(p1 + 1) == '\0'))
			  {
				  for (;q < q1;q++)
				  {
				  System.out.printf("%c",*q);
				  }
			  System.out.printf("%s",p3);
			  q = p1 + 1;
			  }
			 }
			  p2 = q2;
			}
			else if (i == S - 1)
			{
			System.out.printf("%s",q);
			}
		}


	}



}
