package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int i;
	   int[] a = new int[5];
	   int[] m = new int[5];
	   int[] d = new int[5];
	   int[] c = new int[5];
	   int[] t = new int[5];
		 for (i = 0;i < 5;i++)
		 {
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 a[i] = Integer.parseInt(tempVar);
			 }
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 m[i] = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 d[i] = Integer.parseInt(tempVar3);
			 }
		if (((a[i] % 4 == 0 && a[i] % 100 != 0) || a[i] % 400 == 0) == 1)
		{
			switch (m[i])
			{
					  case 1:
						  c[i] = 0;
						  break;
					  case 2:
						  c[i] = 31;
						  break;
					  case 3:
						  c[i] = 60;
						  break;
					  case 4:
						  c[i] = 91;
						  break;
					  case 5:
						  c[i] = 121;
						  break;
					  case 6:
						  c[i] = 152;
						  break;
					  case 7:
						  c[i] = 182;
						  break;
					  case 8:
						  c[i] = 213;
						  break;
					  case 9:
						  c[i] = 244;
						  break;
					  case 10:
						  c[i] = 274;
						  break;
					  case 11:
						  c[i] = 305;
						  break;
					  case 12:
						  c[i] = 335;
						  break;
			}

		}
		else
		{
			switch (m[i])
			{
				case 1:
					c[i] = 0;
					break;
				case 2:
					c[i] = 31;
					break;
				case 3:
					c[i] = 59;
					break;
				case 4:
					c[i] = 90;
					break;
				case 5:
					c[i] = 120;
					break;
				case 6:
					c[i] = 151;
					break;
				case 7:
					c[i] = 181;
					break;
				case 8:
					c[i] = 212;
					break;
				case 9:
					c[i] = 243;
					break;
				case 10:
					c[i] = 273;
					break;
				case 11:
					c[i] = 304;
					break;
				case 12:
					c[i] = 334;
					break;
			}
		}
				  t[i] = c[i] + d[i];
				System.out.printf("%d\n",t[i]);
		 }
	}


}

