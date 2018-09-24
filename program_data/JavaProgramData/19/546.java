package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n1;
		int n2;
		int n3;
		int i;
		int j;
		final String a1 = "";
		final String a2 = "";
		final String a3 = "";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1 = a1.charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2 = a2.charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p3 = a3.charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p_end;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p_in = a1.charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String p_cyc = a1.charAt(0);

		a1 = new Scanner(System.in).nextLine();
		a2 = new Scanner(System.in).nextLine();
		a3 = new Scanner(System.in).nextLine();
		n1 = a1.length();
		n2 = a2.length();
		n3 = a3.length();
		p_end = a1.charAt(n1 - 1);
		for (p1 = a1.charAt(0);p1 <= p_end;p1++)
		{
			if (*p2 == *p1)
			{
				p_in = p1;
				for (j = 0;j < n2;j++)
				{
					if (*p2 != *p1)
					{
						p1--;
						break;
					}
					else
					{
						p2++;
						p1++;
					}

				}
				p2 = a2.charAt(0);
				if (j == n2 && *(p_in - 1) == ' ') //??
				{

					if (n3 > n2)
					{
						p = p_end;

						//
						while (p >= p1)
						{
							*(p + n3 - n2) = *p;
							p--;
						}
						p1 = p1 + n3 - n2;
					}
					if (n3 < n2)
					{
						p = p1;
						p1 = p + n3 - n2;

						while (p <= p_end)
						{
							*(p + n3 - n2) = *p;
							p++;
						}
					}
					p_end = p_end + n3 - n2;

				while (p_in < p1) //??
				{
					*p_in = p3;
					p_in++;
					p3++;
				}
				}
				else if (j == n2 && p_in == a1.charAt(0)) //??
				{

					if (n3 > n2)
					{
						p = p_end;

						//
						while (p >= p1)
						{
							*(p + n3 - n2) = *p;
							p--;
						}
						p1 = p1 + n3 - n2;
					}
					if (n3 < n2)
					{
						p = p1;
						p1 = p + n3 - n2;

						while (p <= p_end)
						{
							*(p + n3 - n2) = *p;
							p++;
						}
					}
					p_end = p_end + n3 - n2;

				while (p_in < p1) //??
				{
					*p_in = p3;
					p_in++;
					p3++;
				}
				}


				p3 = a3.charAt(0);
			}
		}
	for (p = a1.charAt(0);p <= p_end;p++)
	{
		System.out.printf("%c",*p);
	}


		return 0;
	}
}
