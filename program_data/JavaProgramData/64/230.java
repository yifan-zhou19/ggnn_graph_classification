//* * * * * * * * * * * * * * * * * * * * * * * * 
//*????????                             *
//*????????.cpp                         *
//*?????  1000012839                       *
//*???2010.12.18                             *
//* * * * * * * * * * * * * * * * * * * * * * * * 

public class Dot
{
	public int[] dot1 = new int[3]; //    ????????
	public int[] dot2 = new int[3]; //    ????????
	public double distance; //    ???????
}

package <missing>;

public class GlobalMembers
{
	public static Dot[] s = tangible.Arrays.initializeWithDefaultDotInstances(45);
	public static Dot temp = new Dot();
	public static int Main()
	{
		int[][] dot = new int[10][3]; //    ??????
		int n; //    ?????
		int i; //    ?????
		int j;
		int k;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			dot[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			dot[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			dot[i][2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = 0;
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				s[k].dot1[0] = dot[i][0];
				s[k].dot1[1] = dot[i][1];
				s[k].dot1[2] = dot[i][2];
				s[k].dot2[0] = dot[j][0];
				s[k].dot2[1] = dot[j][1];
				s[k].dot2[2] = dot[j][2];
				s[k].distance = Math.sqrt(Math.pow(dot[i][0] - dot[j][0],2) + Math.pow(dot[i][1] - dot[j][1],2) + Math.pow(dot[i][2] - dot[j][2],2));
				k++; //    ??????????????
			}
		}
		for (i = 0; i < k - 1; i++) //    ??k?n*(n-1)/2?
		{
			for (j = 0; j < k - i; j++)
			{
				if (s[j].distance < s[j + 1].distance)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp = s[j];
					temp.copyFrom(s[j]);
					s[j] = s[j + 1];
					s[j + 1] = temp; //    ??????
				}
			}
		}
		for (i = 0; i < k; i++)
		{
			System.out.print('(');
			System.out.print(s[i].dot1[0]);
			System.out.print(',');
			System.out.print(s[i].dot1[1]);
			System.out.print(',');
			System.out.print(s[i].dot1[2]);
			System.out.print(")-(");
			System.out.print(s[i].dot2[0]);
			System.out.print(',');
			System.out.print(s[i].dot2[1]);
			System.out.print(',');
			System.out.print(s[i].dot2[2]);
			System.out.print(")=");
			System.out.printf("%.2f", s[i].distance);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}










}

