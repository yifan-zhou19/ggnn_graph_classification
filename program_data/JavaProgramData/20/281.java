package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static String findmax(char * p)
	{
		String max;
		for (max = p; * p != '\0';p++)
		{
			if (*p > max)
			{
				max = p;
			}
		}
		return max;
	}

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'sp', so pointers on this parameter are left unchanged:
	public static void insert(tangible.RefObject<String> op, char * sp)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * np;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		np = (String)malloc(1000);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * t = np;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * temp;
		String temp2;
	 // printf("%c",*findmax(op));
		for (temp = op.argValue; * temp != findmax(op.argValue);temp++,np++)
		{
			*np = temp;
		}
		temp2 = temp;
		*np = temp;
		np++;

		for (temp = sp; * sp != '\0';np++,sp++)
		{
			*np = sp;
		}

		for (temp = temp2.Substring(1); * temp != '\0';np++,temp++)
		{
			*np = temp;
		}

		*np = '\0';
		while (*t != '\0')
		{
			System.out.printf("%c",*t);
			t++;
		}
	  // printf("%c",'\0');
	   System.out.print("\n");
	}

	public static void Main()
	{
		String ori = new String(new char[10]);
		String sub = new String(new char[3]);
		String newstr = new String(new char[13]);
		String orip = ori;
		String subp = sub;
		String newstrp = newstr;
		while (scanf("%s %s", ori, sub) != EOF)
		{

	 tangible.RefObject<String> tempRef_orip = new tangible.RefObject<String>(orip);
		 insert(tempRef_orip, subp);
		 orip = tempRef_orip.argValue;
		//	printf ("%s\n", newstrp);
		}
	}


}

