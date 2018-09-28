package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		String a = new String(new char[100]);
		n = 0;
		while (scanf("%s",a) != EOF)
		{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * p;
			 if (n == 0)
			 {
				 for (p = a,i = 0; * p != '\0';p++,i++)
				 {
					 ;
				 }
				 System.out.printf("%d",i);
				   n++;
			 }
			 else
			 {
				for (p = a,i = 0; * p != '\0';p++,i++)
				{
					;
				}
				System.out.printf(",%d",i);
			 }
		}
	}

}
