package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		//freopen("in.txt","r",stdin);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		String p2;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pp;
		String p1s;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p2 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		pp = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		//p1 p2 p??????????????????
		while (scanf("%s%s",p1,p2) != EOF)
		{
			int max = 0;
			pp = p1;
			p1s = p1;
		  while (*p1 != '\0')
		  {
			  if (*p1 > max)
			  {
				  max = p1;
			  }
			  p1++;
		  }
		  //???
		  //printf("%c\n",max);
		  //printf("%s\n",pp);
		  String ps;
		  ps = p;
		  while (*pp != max)
		  {

			  *p = pp;
			  p++;
			  pp++;
		  }
		  *p = pp;
		  p++;
		  pp++;
		  *p = '\0';
		  //?????????????p?
		 // printf("%s\n",ps);
		  //printf("%s\n",p2);
		  ps += p2; //??
		  //printf("%s\n",ps);
		  while (*p != '\0')
		  {
			  *p++;
		  }

		  while (*pp != '\0')
		  {
			  *p = pp;
			  p++;
			  pp++;
		  }
		  *p = '\0';
		  //???????????p
		  System.out.printf("%s\n",ps);
		}
		return 0;
	}

}
