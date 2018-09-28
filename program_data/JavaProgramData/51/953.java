package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void chuan(char p[5],char * q,int n);
		String c = new String(new char[300]);
		final String a = "";
		(char)(*p)[5];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		int n;
		int s;
		int i;
		int j;
		int k;
		int[] max = new int[500];
		int da = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		p = a;
		q = c;
		for (s = 0; * q != '\0';q++)
		{
			s++;
		}
		for (i = 0,q = c;i < s - n + 1;i++,q++,p++)
		{
		tangible.RefObject<String> tempRef_q = new tangible.RefObject<String>(q);
			chuan(p, tempRef_q, n);
			q = tempRef_q.argValue;
		}
		k = s - n + 1;
	/*	for(i=0;i<k;i++)
			printf("%s\n",a[i]);    */
		for (i = 0;i < k;i++)
		{
			for (j = i + 1;j < k;j++)
			{
	//			printf("%s %s ",a[i],a[j]);
				if (strcmp(a.charAt(i),a.charAt(j)) == 0)
				{
					max[i]++;
				}
	//			printf("%d %d\n",max[i],i);
			}
		}
		for (i = 0;i < k;i++)
		{
			if (max[i] > da)
			{
				da = max[i];
			}
		}
		if (da == 0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",da + 1);
			for (i = 0;i < k;i++)
			{
				if (da == max[i])
				{
					System.out.printf("%s\n",a.charAt(i));
				}
			}
		}
		return 0;
	}
	public static void chuan(String p, tangible.RefObject<String> q, int n)
	{
		int i = 0;
		for (i = 0;i < n;i++)
		{
			*(p[0].Substring(i)) = *(q.argValue.Substring(i));
		}
	}
}

