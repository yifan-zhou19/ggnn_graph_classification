package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		String s1 = new String(new char[101]); //????????????
		char[] s2 = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}; //?????????????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null; //??????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = null;
		s1 = new Scanner(System.in).nextLine(); //?????
		l = s1.length(); //????
		for (i = 0,p = s1,q = s2;i < l;i++,p++,q++) //????????
		{
			if (i < l - 1) //??????????
			{
				*q = p + *(p + 1); //???????????
			}
			else //??  ?????????
			{
				*q = p + *(p - l + 1); //???????????
			}
		}
		System.out.print(s2);
		System.out.print("\n");
		return 0;
	}

}
