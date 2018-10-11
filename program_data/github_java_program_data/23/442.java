package trans;

import main.Updater;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.Collection;

/**
 * Created by Barr on 29-Sep-14.
 *
 */
public class Queue extends AbstractAnalyser {


    public Queue(Updater i) {
        super(i);
    }

    @Override
    public String getNameOfClass() {
        return "Queue";
    }

    @Override
    public ClassNode identify(Collection<ClassNode> classNodes) {
        for (ClassNode classNode : classNodes){
            int amountOfNodes = 0, found = 0;
            if (classNode.superName.equals("java/lang/Object")){
                for (FieldNode fieldNode : classNode.fields){
                    if (fieldNode.desc.equals(String.format("L%s;", instance.getClassName("CacheableNode"))) && fieldNode.access == 0x0000){
                        found++;
                    }
                    amountOfNodes++;
                }
            }
            if (found == 1 && amountOfNodes == 1){
                return classNode;
            }
        }
        return null;
    }

    @Override
    public ClassNode manipulate(ClassNode classNode) {
        if (classNode != null){
            System.out.println("* Queue '" + classNode.name + "'     [Extends " + classNode.superName + "]");
            for (FieldNode fieldNode : classNode.fields) {
                System.out.println(" ~ Head() : " + classNode.name + "." + fieldNode.name);
            }

        } else {
            System.out.println("* Queue 'BROKEN'");
        }

        System.out.println();
        return classNode;
    }
}
