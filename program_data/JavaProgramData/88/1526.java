package <missing>;

public class GlobalMembers
{
	/*-----------------------------------------*
	|? ? ?   ?????                 	    |
	|? ?      ????	                    |
	|? ? ? ??2010 ? 12 ? 09 ?		    |
	|? ?      ?1000012758		            |
	\*-----------------------------------------*/ 
	public static int Main()
	{
		String text = new String(new char[50]); //??????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		p = text; //??????
		p = new Scanner(System.in).nextLine(); //??
		for (; * p != 0; p++)
		{
			if (*p < '0' || *p > '9')
			{
				*p = 0; //???????????
			}
		}
		*p = 1; //????
		p = text - 1; //????
		while (*(++p) != 1)
		{
			if (*p != 0) //?????
			{
				System.out.print(p);
			}
			else if (*(p + 1) != 0) //???????????
			{
				System.out.print("\n");
			}
		}
			return 0;
	}
}
