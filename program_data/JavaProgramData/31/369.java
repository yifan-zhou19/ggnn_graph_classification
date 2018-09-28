//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class student
{
		public String number = new String(new char[30]);
		public String name = new String(new char[30]);
		public char gender;
		public int age;
		public String score = new String(new char[30]);
		public String add = new String(new char[30]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int[] lengthofnumber = new int[505];
		int[] lengthofname = new int[505];
		int[] lengthofadd = new int[505];
		int[] lengthofscore = new int[505];
		int i;
		int j;
		int numberofstudent = 0;
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(505);
		for (i = 0;i < 505;i++)
		{ //read
			for (j = 0;j < 30;j++)
			{ //number
				String tempVar = ConsoleInput.scanfRead(null, 1);
				if (tempVar != null)
				{
					stu[i].number = tangible.StringFunctions.changeCharacter(stu[i].number, j, tempVar);
				}
				if (stu[i].number.charAt(j) == ' ' || stu[i].number.charAt(j) == 'd')
				{
					break;
				}
				else
				{
					lengthofnumber[i] += 1;
				}
			} //number
			if (stu[i].number.charAt(2) == 'd')
			{
				break;
			}
			else
			{
				numberofstudent += 1;
			}
			for (j = 0;j < 30;j++)
			{ //name
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					stu[i].name = tangible.StringFunctions.changeCharacter(stu[i].name, j, tempVar2);
				}
				if (stu[i].name.charAt(j) == ' ')
				{
					break;
				}
				else
				{
					lengthofname[i] += 1;
				}
			} //name
			String tempVar3 = ConsoleInput.scanfRead(null, 1);
			if (tempVar3 != null)
			{
				stu[i].gender = tempVar3.charAt(0);
			}
			System.in.read();
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].age = Integer.parseInt(tempVar4);
			}
			System.in.read();
			for (j = 0;j < 30;j++)
			{ //score
				String tempVar5 = ConsoleInput.scanfRead(null, 1);
				if (tempVar5 != null)
				{
					stu[i].score = tangible.StringFunctions.changeCharacter(stu[i].score, j, tempVar5);
				}
				if (stu[i].score.charAt(j) != ' ')
				{
					lengthofscore[i] += 1;
				}
				else
				{
					break;
				}
			} //score
			for (j = 0;j < 30;j++)
			{ //add
				String tempVar6 = ConsoleInput.scanfRead(null, 1);
				if (tempVar6 != null)
				{
					stu[i].add = tangible.StringFunctions.changeCharacter(stu[i].add, j, tempVar6);
				}
				if (stu[i].add.charAt(j) != '\n')
				{
					lengthofadd[i] += 1;
				}
				else
				{
					break;
				}
			} //add

		} //read
				i = numberofstudent - 1;
				while (i != 0) //for(i=numberofstudent-1;i==0;i--)
				{

					for (j = 0;j < lengthofnumber[i];j++)
					{
						System.out.printf("%c",stu[i].number.charAt(j));
					}
					System.out.print(" ");
					for (j = 0;j < lengthofname[i];j++)
					{
						System.out.printf("%c",stu[i].name.charAt(j));
					}
					System.out.print(" ");
					System.out.printf("%c ",stu[i].gender);
					System.out.printf("%d ",stu[i].age);
					for (j = 0;j < lengthofscore[i];j++)
					{
						System.out.printf("%c",stu[i].score.charAt(j));
					}
					System.out.print(" ");
					for (j = 0;j < lengthofadd[i];j++)
					{
						System.out.printf("%c",stu[i].add.charAt(j));
					}
					System.out.print("\n");
					i--;
				}

				for (j = 0;j < lengthofnumber[0];j++)
				{
					System.out.printf("%c",stu[0].number.charAt(j));
				}
				System.out.print(" ");
				for (j = 0;j < lengthofname[0];j++)
				{
					System.out.printf("%c",stu[0].name.charAt(j));
				}
				System.out.print(" ");
				System.out.printf("%c ",stu[0].gender);
				System.out.printf("%d ",stu[0].age);
				for (j = 0;j < lengthofscore[0];j++)
				{
						System.out.printf("%c",stu[0].score.charAt(j));
				}

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


