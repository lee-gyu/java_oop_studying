package academy.pocu.comp2500.assignment1;

import academy.pocu.comp2500.assignment1.registry.Registry;

public class App {
    public App(Registry registry) {
        // Register like this
        // registry.registerPostAdder("Foo", "bar");

        registry.registerBlogCreator("Blog");
        registry.registerPostAdder("Blog", "addPost");
        registry.registerPostOrderSetter("Blog", "setPostOrder");
        registry.registerTagFilterSetter("Blog", "addTagFilter");
        registry.registerAuthorFilterSetter("Blog", "setAuthorFilter");
        registry.registerPostListGetter("Blog", "getPostList");

        registry.registerPostTitleUpdater("Post", "setTitle");
        registry.registerPostBodyUpdater("Post", "setBody");
        registry.registerPostTagAdder("Post", "addTag");
        registry.registerCommentAdder("Post", "addComment");
        registry.registerReactionAdder("Post", "addReaction");
        registry.registerReactionRemover("Post", "removeReaction");
        registry.registerCommentListGetter("Post", "getCommentList");

        registry.registerCommentUpdater("Comment", "updateComment");
        registry.registerCommentUpvoter("Comment", "upVote");
        registry.registerCommentDownvoter("Comment", "downVote");
        registry.registerSubcommentAdder("Comment", "addComment");
        registry.registerSubCommentListGetter("Comment", "getCommentList");

        registry.registerSubcommentUpdater("Comment", "updateComment");
        registry.registerSubcommentUpvoter("Comment", "upVote");
        registry.registerSubcommentDownvoter("Comment", "downVote");
    }
}
